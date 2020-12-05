@echo off
>output.txt (

	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=CG -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=CG -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=FT -np24 class=A
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=FT -np24 class=A
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=IS -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=IS -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runOriginalBenchmark -BM=MG -np24 class=B
	java -jar model-checking-benchmarks-v0.1.jar -runUpdatedBenchmark  -BM=MG -np24 class=B	
)
