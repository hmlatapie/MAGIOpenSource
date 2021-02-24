#REDUCTED#
import networkx as nx
def networkx2nars(G:nx.MultiGraph, include_questions:None):
    #This function receives a networkx multigraph and translates it to Narsese
    #It attaches questions if include_question has comma-separated concepts as a string.
    #E.g., include_questions ='car,dog'
    nars_st=""
    name=""
    relation=""
    #Translate attributes with string values only. 
    for n in list(G.nodes(data=True)):
        name=n[0]
        for key, value in n[1].items():
            if(not str.isdigit(str(value))):
                nars_st = nars_st+"<"+name+"-->"+str(value)+">.\n"
    
    #Translate relations and add them to the nars_st 
    if(nx.is_directed(G)): #Relations in a directed graph are not symmetric
        for obj1,obj2,r in list(G.edges(data=True)):
            rel_name = r['relation']
            relation = relation + "<(*, "+obj1+", " +obj2+")-->"+rel_name+">.\n"
    nars_st = nars_st+relation
    
    ### Append nars_st with questions
    if(include_questions!=None):
        q_concepts=include_questions.split(',')
        q_str=""
        for n in list(G.nodes(data=True)):
              name=n[0]
              for q_c in q_concepts:
                  q_str = q_str+ "<"+name+"-->"+q_c+">?\n" 
        nars_st = nars_st + q_str   
    
    return nars_st
    
if __name__ == "__main__":
    G = nx.MultiDiGraph()
    G=nx.read_graphml('test.graphml')
    include_questions="product,shelf"
    Narsese=""
    Narsese=networkx2nars(G,include_questions)
    #REDUCTED#