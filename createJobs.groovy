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
pipelineJob('tutor-chat-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/kilev/tutorChat.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}
pipelineJob('tutor-chat-aws') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/kilev/tutorChat.git'
                    }
                    branch 'master'
                    scriptPath('Jenkinsfile-aws')
                }
            }
        }
    }
}
