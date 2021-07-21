package Lombok.model.taskModel;


import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data
@Table(name = "ki_data", schema = "public", catalog = "etpreport")
public class KiData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "list_of_required")
    private String listOfRequired;

    @Column(name = "result_description")
    private String resultDescription;

    @Column(name = "contact")
    private String contact;

    @OneToOne
    @ToString.Exclude
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    private Task task;


}
