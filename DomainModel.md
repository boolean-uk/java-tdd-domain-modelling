# Domain Model

## This is a headin

This is some text.

```
As a user,
So I can find a specific cohort,
I want ti search a list of all cohorts by a cohort name

```

| Classes       | Methods                                   | Fields | Scenario                   | Outcome      |
|---------------|-------------------------------------------|--------|----------------------------|--------------|
| CohortManager | search(List<String> cohorts, String name) |        | If name is in the list     | return true  |
|               |                                           |        | If name is not in the list | return false |


| Classes       | Methods             | Fields              | Scenario                   | Outcome      |
|---------------|---------------------|---------------------|----------------------------|--------------|
| CohortManager | search(String name) | List<String> cohort | If name is in the list     | return true  |
|               |                     |                     | If name is not in the list | return false |


| Classes       | Methods             | Fields               | Scenario                     | Outcome                |
|---------------|---------------------|----------------------|------------------------------|------------------------|
| CohortManager | search(String name) | List<String> cohorts | Check if name is in the list | return optional cohort |
