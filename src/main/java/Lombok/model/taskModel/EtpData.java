package Lombok.model.taskModel;


import com.vladmihalcea.hibernate.type.array.ListArrayType;
import lombok.Data;
import lombok.ToString;
import org.hibernate.annotations.TypeDef;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@TypeDef(name = "list-array", typeClass = ListArrayType.class)
@Table(name = "etp_data", schema = "public", catalog = "etpreport")
@Data
public class EtpData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column (name = "task_id", insertable = false, updatable = false)
    // @ForeignKey(name = "task_id")
    private Long task_id;

    @Column(name = "service_number")
    private String serviceNumber;

    @Column(name = "front_request")
    private String frontRequest;

    @Column(name = "front_headers")
    private String frontHeaders;

    @Column(name = "app_queue")
    private String appQueue;

    @Column(name = "app_queue_qm")
    private String appQueueQm;

    @Column(name = "status_queue")
    private String statusQueue;

    @Column(name = "status_queue_qm")
    private String statusQueueQm;

    @Column(name = "oiv_status")
    private String oivStatus;

    @Column(name = "work_description")
    private String workDescription;

    @Column(name = "tr_text")
    private String trText;

    @Column(name = "pmi_task_text")
    private String pmiTaskText;

    @Column(name = "pmi_result_text")
    private String pmiResultText;

    @OneToOne
    @JoinColumn(name = "task_id", referencedColumnName = "id")
    @ToString.Exclude
    private Task task;


}
