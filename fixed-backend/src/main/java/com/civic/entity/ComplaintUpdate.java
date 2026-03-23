package com.civic.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "complaint_updates")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintUpdate {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "complaint_id", nullable = false)
    private Complaint complaint;
    
    @ManyToOne
    @JoinColumn(name = "updated_by", nullable = false)
    private User updatedBy;
    
    @Column(columnDefinition = "TEXT")
    private String remarks;
    
    @Enumerated(EnumType.STRING)
    private Complaint.Status status;
    
    @CreationTimestamp
    @Column(name = "updated_at", updatable = false)
    private LocalDateTime updatedAt;
}
