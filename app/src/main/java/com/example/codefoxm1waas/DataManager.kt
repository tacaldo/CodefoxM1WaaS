package com.example.codefoxm1waas

object DataManager {


    //private var job = Job(0, "Job_0", jobDescription = "JobDescription0", jobFacets = null, jobLocationInfo = null)
    var jobFacet = JobFacet("JobFacet0")

    // var children: MutableList<Person> = mutableListOf<>()
    var job = Job(null,null,null,null,null)

    //private var jobs = mutableListOf<Job>(job)
    private var jobs = mutableListOf<Job>()


    public fun initializeJobs(): List<Job> {
        jobs.clear()

        job.jobId = 1
        job.jobName = "Painter"
        job.jobDescription = "Interior painting, 4 br house.."
        job.jobFacets = mutableListOf<JobFacet>(
            JobFacet("Indoor"),
            JobFacet("Construction"),
            JobFacet("Remodeling")
        )

        job.jobLocationInfo = "job1LocInfo"

        jobs.add(job)

        job = Job(null,null,null,null,null)

        job.jobId = 2
        job.jobName = "Construction Worker"
        job.jobDescription = "Day laborer needed for construction cleanup.."

        job.jobFacets = mutableListOf<JobFacet>(
            JobFacet("Construction"),
            JobFacet("Outdoors")
        )

        job.jobLocationInfo = "job2LocInfo"

        jobs.add(job)

        job = Job(null,null,null,null,null)

        job.jobId = 3
        job.jobName = "Landscaping"
        job.jobDescription = "Grass cutting, trimming, cleanup.."

        job.jobFacets = mutableListOf<JobFacet>(
            JobFacet("Outdoors")
        )

        job.jobLocationInfo = "job2LocInfo"

        jobs.add(job)

        job = Job(null,null,null,null,null)

        job.jobId = 4
        job.jobName = "Roofer Helper"
        job.jobDescription = "Construction cleanup shingles, roof debris.."

        job.jobFacets = mutableListOf<JobFacet>(
            JobFacet("Outdoors")
        )

        job.jobLocationInfo = "job2LocInfo"

        jobs.add(job)

        job = Job(null,null,null,null,null)

        job.jobId = 5
        job.jobName = "Event Prep and Tear Down"
        job.jobDescription = "Concert seating setup and tear down after event.."

        job.jobFacets = mutableListOf<JobFacet>(
            JobFacet("Outdoors")
        )

        job.jobLocationInfo = "job2LocInfo"

        jobs.add(job)

        job = Job(null,null,null,null,null)

        job.jobId = 6
        job.jobName = "Furniture Mover"
        job.jobDescription = "Load truck, 5 br house.."

        job.jobFacets = mutableListOf<JobFacet>(
            JobFacet("Outdoors")
        )

        job.jobLocationInfo = "job2LocInfo"

        jobs.add(job)

        job = Job(null,null,null,null,null)

        job.jobId = 7
        job.jobName = "Car Detail"
        job.jobDescription = "Detail vehicle for dealer prep and delivery..."

        job.jobFacets = mutableListOf<JobFacet>(
            JobFacet("Outdoors")
        )

        job.jobLocationInfo = "job2LocInfo"

        jobs.add(job)

        job = Job(null,null,null,null,null)

        job.jobId = 8
        job.jobName = "Yard Work"
        job.jobDescription = "Carry rock, layout pine straw..."

        job.jobFacets = mutableListOf<JobFacet>(
            JobFacet("Outdoors")
        )

        job.jobLocationInfo = "job2LocInfo"

        jobs.add(job)

        job = Job(null,null,null,null,null)

        job.jobId = 9
        job.jobName = "Siding Installer Helper"
        job.jobDescription = "Assist with siding install, small house..."

        job.jobFacets = mutableListOf<JobFacet>(
            JobFacet("Outdoors")
        )

        job.jobLocationInfo = "job2LocInfo"

        jobs.add(job)


        return  jobs

    }



}