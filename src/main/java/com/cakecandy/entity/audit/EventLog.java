package com.cakecandy.entity.audit;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "event_logs")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EventLog {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "event_log_id")
  private Integer eventLogId;

  @Column(name = "event_log_message", nullable = false, length = 255)
  private String eventLogMessage;

  @Column(name = "event_log_date", nullable = false)
  private LocalDateTime eventLogDate;
}
