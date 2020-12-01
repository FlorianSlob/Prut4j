@echo off
>output.txt (

	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=IS -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=IS -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=IS -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=IS -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=IS -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=IS -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=IS -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=IS -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=IS -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=IS -np24 class=B
	
)
