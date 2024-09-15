function isCyclic(node, adjacencyList, visited, recursionStack) {
  if (recursionStack[node]) {
    return true;
  }

  if (visited[node]) {
    return false;
  }

  visited[node] = true;
  recursionStack[node] = true;

  const neighbors = adjacencyList[node];
  for (const neighbor of neighbors) {
    if (isCyclic(neighbor, adjacencyList, visited, recursionStack)) {
      return true;
    }
  }

  recursionStack[node] = false;
  return false;
}

function hasCircularDependency(adjacencyList) {
  const visited = {};
  const recursionStack = {};

  for (const node in adjacencyList) {
    if (!visited[node] && isCyclic(node, adjacencyList, visited, recursionStack)) {
      const cycleNodes = [];
      for (const key in recursionStack) {
        if (recursionStack[key]) {
          cycleNodes.push(parseInt(key));
        }
      }
      return cycleNodes;
    }
  }

  return null;
}

const adjacencyList = {1:[7],2:[1],3:[2],4:[],5:[],6:[4,5],7:[3]};

const circularDependency = hasCircularDependency(adjacencyList);
if (circularDependency) {
  console.log("Circular dependency detected:", circularDependency);
} else {
  console.log("No circular dependency found.");
}
