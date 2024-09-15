package com.ghostchu.peerbanhelper.downloaderplug.vuze.network;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConnectorData {
    private String software;
    private String version;
    private String abbrev;
}
