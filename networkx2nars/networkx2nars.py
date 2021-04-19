#REDUCTED#
import networkx as nx
import sys

def networkx2nars(G:nx.MultiGraph, include_questions = "", old_translation=True):
    #This function receives a networkx multigraph and translates it to Narsese
    #It attaches questions if include_question has comma-separated concepts as a string.
    #E.g., include_questions ='car,dog'
    nars_st=""
    name=""
    relation=""
    #Translate attributes with string values only. 
    if old_translation: #Whether to use data key to form inheritances instead of what the exporter from Narsese to graph uses, namely edges
        for n in list(G.nodes(data=True)):
            name=n[0]
            for key, value in n[1].items():
                if(not str.isdigit(str(value))):
                    nars_st = nars_st+"<"+name+" --> "+str(value)+">.\n"
    
    #Translate relations and add them to the nars_st 
    if(nx.is_directed(G)): #Relations in a directed graph are not symmetric
        for obj1,obj2,r in list(G.edges(data=True)):
            rel_name = r['relation']
            if rel_name != "-->":
                relation = relation + "<(*, "+obj1+", " +obj2+") --> "+rel_name+">.\n"
            else:
                relation = "<" + obj1 + " --> " + obj2 + ">.\n"
    nars_st = nars_st+relation
    
    ### Append nars_st with questions
    if(include_questions != ""):
        q_concepts=include_questions.split(',')
        q_str=""
        for n in list(G.nodes(data=True)):
              name=n[0]
              for q_c in q_concepts:
                  q_str = q_str+ "<"+name+" --> "+q_c+">?\n" 
        nars_st = nars_st + q_str   
    
    return nars_st
    
if __name__ == "__main__":
    G = nx.MultiDiGraph()
    G=nx.read_graphml('test.graphml' if (len(sys.argv) <= 1) else sys.argv[1]) #first argument can be a custom graphml file
    include_questions="" if (len(sys.argv) <= 2 or sys.argv[2] == "OldTranslation") else sys.argv[2] #include question terms as second argument, but not if OldTranslation command param is used here
    UseOldTranslation = "OldTranslation" in sys.argv #OldTranslation command param, can be at arbitrary location
    if len(sys.argv) <= 1: #backward compatibility: if there is no parameter used, go back to "product, shelf" and old translation mode
        include_questions = "product,shelf"
        UseOldTranslation = True
    #Hence, "python3 networkx2nars.py test.graphml product,shelf OldTranslation" is the same as "python3 networkx2nars.py"
    #recommended however is the new translation mode which is compatible with the exporter: "python3 networkx2nars.py file.graphml [questionTerms]"
    Narsese=""
    Narsese=networkx2nars(G,include_questions, UseOldTranslation)
    print(Narsese)
    #REDUCTED#
