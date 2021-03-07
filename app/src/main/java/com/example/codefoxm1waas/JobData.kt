package com.example.codefoxm1waas


class JobFacet(var jobFacetDescription: String)

class Job(
    var jobId: Int?,
    var jobName: String?,
    var jobDescription: String?,
    var jobFacets: List<JobFacet>?,
    var jobLocationInfo: String?
    //var isChecked: Boolean
)






