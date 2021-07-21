package Lombok.model.taskModel;


import com.vladmihalcea.hibernate.type.array.ListArrayType;
import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@TypeDef(name = "list-array", typeClass = ListArrayType.class)
@Table(name = "task", schema = "public", catalog = "etpreport")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "num")
    private String num;

    @Column(name = "type_label")
    private String typeLabel;

    @Column(name = "complexity_label")
    private String complexityLabel;

    @Column(name = "work_label_pz")
    private String workLabelPz;

    @Column(name = "work_label_pmi")
    private String workLabelPmi;

    @Column(name = "task_order")
    private Long taskOrder;

    @Column(name = "service_name")
    private String serviceName;

    @Type(type = "list-array")
    @Column(name = "service_code", columnDefinition = "integer[]")
    private List<Integer> serviceCode;

    @Column(name = "mode_label")
    private String modeLabel;

    @Column(name = "contract_stage_id")
    private Long contractStageId;

    @Column(name = "template_type_label")
    private String templateTypeLabel;

    @Column(name = "template_word_label")
    private String templateWordLabel;

    @Column(name = "chtz_num")
    private String chtzNum;

    @OneToOne(mappedBy = "task")
    private PfData pfData;

    @OneToOne(mappedBy = "task")
    private EtpData etpData;

    @OneToOne(mappedBy = "task")
    private EfpData efpData;

    @OneToOne(mappedBy = "task")
    private KiData kiData;

    @ManyToOne
    @JoinColumn(name = "inf_system_code")
    private DictSubsystems dictSubsystems;

}
