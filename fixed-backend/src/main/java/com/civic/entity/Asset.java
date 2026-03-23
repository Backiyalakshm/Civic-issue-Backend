package com.civic.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name = "assets")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Asset {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String name;
    
    @Column(nullable = false)
    private String type;
    
    private String location;
    
    private Double latitude;
    
    private Double longitude;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status = Status.OPERATIONAL;
    
    @Column(name = "last_maintenance_date")
    private LocalDate lastMaintenanceDate;
    
    private String description;
    
    public enum Status {
        OPERATIONAL, NEEDS_MAINTENANCE, UNDER_MAINTENANCE, OUT_OF_SERVICE
    }
}
