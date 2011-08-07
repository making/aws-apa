package am.ik.aws.apa;

import javax.xml.ws.WebServiceException;

interface WebServiceInvoker<T> {
    T invoke() throws WebServiceException;
}
