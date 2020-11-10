pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('tutor-chat') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/kilev/tutorChat.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}
