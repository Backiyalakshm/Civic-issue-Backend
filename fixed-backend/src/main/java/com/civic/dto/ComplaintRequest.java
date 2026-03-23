package com.civic.dto;

import com.civic.entity.Complaint;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ComplaintRequest {
    
    @NotBlank(message = "Title is required")
    private String title;
    
    private String description;
    
    @NotBlank(message = "Category is required")
    private String category;
    
    private String location;
    
    private Double latitude;
    
    private Double longitude;
    
    @NotNull(message = "User ID is required")
    private long userId;
    
    private Complaint.Priority priority;
    
    private String imageUrl;
}
