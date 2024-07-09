package com.ghostchu.peerbanhelper.downloaderplug.vuze.network.bean.clientbound;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class UnBanBean {
    private List<String> ips;
}
