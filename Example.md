# Example Domain Model

## User Stories

```
As a user,
So I can find a specific cohort,
I want to search a list of all cohorts by cohort name.
```

## Domain Model

| Classes       | Methods                                              | Scenario               | Outputs |
|---------------|------------------------------------------------------|------------------------|---------|
| CohortManager | search(ArrayList<String> cohorts, String cohortName) | If name is in list     | true    |
|               |                                                      | If name is not in list | false   |


### CohortManager Class

| Methods                   | Member Variables          | Scenario               | Outputs |
|---------------------------|---------------------------|------------------------|---------|
| search(String cohortName) | ArrayList<String> cohorts | If name is in list     | True    |
|                           |                           | If name is not in list | False   |


