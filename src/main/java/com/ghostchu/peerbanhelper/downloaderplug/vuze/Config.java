package com.ghostchu.peerbanhelper.downloaderplug.vuze;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Config {
    private int port;
    private String token;
}
