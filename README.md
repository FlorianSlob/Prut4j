# Prut4j: <ins>Pr</ins>otocol <ins>U</ins>nit <ins>T</ins>esting fo(u)r <ins>J</ins>ava

This repository contains projects that were used to develop Prut4j, a tool to simplify unit testing of channel/queue-based communication protocols in concurrent Java programs. All projects are outlined below. Projects can be run as Gradle projects. 

# Main projects
## <ins>code-generator</ins>
Uses the jar that has been generated by the discourje project to obtain an LTS for every protocol and generates a protocol implementation (starting point: ProtocolCodeGenerator.runActivity()). The protocol definition files (.dcj format) can be found in the 'protocol_definiton' folder. Protocol implementations are generated to the 'tests' and 'benchmarks' projects:

 - Network Topologies: /tests/src/main/java/nl/florianslob/modelchecking/generated/network_topologies
 - Games: /tests/src/main/java/nl/florianslob/modelchecking/generated/games
 - NPB: /benchmarks/src/main/java/nl/florianslob/modelchecking/generated/

## <ins>tests</ins>
Contains generated protocols and unit tests in .owl files (in the 'formulas' subfolder) for some example game protocols (Tic-Tac-Toe, Rock-Paper-Scissors, GoFish), some network topology protocols, and for the NPB benchmark protocols (CG, IS, FT, MG). Some long running tests are disabled by default (Commented out // @Test). All test classes are postfixed with 'Tests'.

## <ins>benchmarks</ins>
Contains the original version of the NPB benchmarks and an updated version where Prut4j is used for comparison. The 'generate-jar' build task has been used to publish a jar file to the 'benchmark-jar-files' folder (at the root of the repository). This folder also contains some auxilary scripts to run the benchmarks as well as benchmark results (raw data and analysis; see the 'results' subfolder).

# Helper/Library projects

## <ins>library</ins>
Contains the test execution engine (nl.florianslob.modelchecking.base.runtime.v2 package) and some other auxilary logic.

## <ins>discourje</ins>
Parsing of protocol definitions to LTS datastructure. Moves a Jar file to the code-generator project. 

## <ins>api</ins>
Contains shared interfaces and classes.

## <ins>owl</ins>
Library for parsing LTL formulas in .owl files to automata representation.
