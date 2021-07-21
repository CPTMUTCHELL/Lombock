package Lombok.model.taskModel;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "dict_subsystems", schema = "public", catalog = "etpreport")
@Data
public class DictSubsystems {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @OneToMany(
            mappedBy = "dictSubsystems", fetch = FetchType.EAGER
    )
    @OrderBy("id desc")
    @ToString.Exclude
    private List<Task> tasks = new ArrayList<>();


}
