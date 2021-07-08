package simplon.com.mcq.services;

import org.springframework.stereotype.Service;

import simplon.com.mcq.domain.dtos.QcmCreate;
import simplon.com.mcq.domain.entities.Qcm;
import simplon.com.mcq.repositories.QcmRepository;

@Service
public class QcmServiceImpl implements QcmService {
    private final QcmRepository qcms;

    public QcmServiceImpl(QcmRepository qcms) {
	this.qcms = qcms;
    }

    @Override
    public void create(QcmCreate inputs) {
	Qcm entity = new Qcm();
	entity.setQcmName(inputs.getQcmName());

    }

}
