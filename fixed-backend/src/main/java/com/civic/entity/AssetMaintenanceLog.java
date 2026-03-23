package com.civic.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "asset_maintenance_log")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssetMaintenanceLog {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "asset_id", nullable = false)
    private Asset asset;
    
    @Column(columnDefinition = "TEXT")
    private String remarks;
    
    @ManyToOne
    @JoinColumn(name = "updated_by", nullable = false)
    private User updatedBy;
    
    @Column(nullable = false)
    private LocalDate date;
    
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private LocalDateTime createdAt;
}
