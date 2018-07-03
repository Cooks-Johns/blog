//import pandas as pd
//df1 = pd.read_csv("C:./downloads/Churn_ModChurn_Modelling.csv")
//print(df1)
//
//
//file = "./downloads/Churn_ModChurn_Modelling.csv'
//dfs = pd.read_csv(file, sep="/", header=0,iterator=True, chunksize=1000000, dtype=str)
//
//giant_df = pd.concat(dfs)
//
//print(giant_df.index)
//
//
//file = "./downloads/Churn_ModChurn_Modelling.csv"
//dfs = pd.read_csv(file, sep="/", header=0,iterator=True, chunksize=1000000, dtype=str)
//
//for df in dfs:
//print(df.index)
//
//df.to_csv('output_file.csv', mode='a', index=False)