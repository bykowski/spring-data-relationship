package pl.bykowski.hibernateassociation.oneway.one2many;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import java.util.HashSet;
import java.util.Set;

@Service("TeacherStart")
public class Start {

    private SubjectRepo subjectRepo;
    private TeacherRepo teacherRepo;

    @Autowired
    public Start(SubjectRepo subjectRepo, TeacherRepo teacherRepo) {
        this.subjectRepo = subjectRepo;
        this.teacherRepo = teacherRepo;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void start() {
        Teacher teacher = new Teacher();

        Subject subject1 = new Subject();
        Subject subject2 = new Subject();

        Set<Subject> subjectSet = new HashSet<>();
        subjectSet.add(subject1);
        subjectSet.add(subject2);

        teacher.setSubjects(subjectSet);

        subjectRepo.save(subject1);
        subjectRepo.save(subject2);
        teacherRepo.save(teacher);
    }
}
