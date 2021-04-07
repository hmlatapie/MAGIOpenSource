from py2neo import Graph

graph = Graph(host="localhost")
nodes = graph.nodes.match().all()

# Translate the Neo4j Movie Graph Database to Narsese

nars_nodes_str = ""
for node in nodes:
    labels = list(node.labels)
    # Should determine a single property name and read node's name from it.
    name = node.get('title') if node.get('title') is not None else node.get('name')
    for label in labels:
        if not str.isdigit(str(label)):
            nars_nodes_str += "<"+name+"-->"+str(label)+">.\n"

    # properties = dict(node)

relationships = graph.relationships.match().all()
nars_relationships_str = ""
for relationship in relationships:
    start_node = relationship.start_node
    end_node = relationship.end_node
    start_name = start_node.get('title') if start_node.get('title') is not None else start_node.get('name')
    end_name = end_node.get('title') if end_node.get('title') is not None else end_node.get('name')
    relationship_name = type(relationship).__name__
    nars_relationships_str += "<(*, " + start_name + ", " + end_name + ")-->" + relationship_name + ">.\n"

nars_str = nars_nodes_str + nars_relationships_str
print(nars_str)
