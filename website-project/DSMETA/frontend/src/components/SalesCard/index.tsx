import NotificationButton from '../NotificationButton';
import './styles.css';

import DatePicker from "react-datepicker";
import "react-datepicker/dist/react-datepicker.css";
import { useState } from 'react';


function SalesCard() {
    const max = new Date();
    const min = new Date(new Date().setDate(new Date().getDate() - 90));

    const [minDate, setMinDate] = useState(min);
    const [maxDate, setMaxDate] = useState(max);


    return (
        <section id='sales'>
            <div className="DSMeta-container">
                <div className="DSMeta-card">
                    <h2 className="DSMeta-sales-title">Sales</h2>

                    <div>
                        <div className="DSMeta-input-box-formatting">
                            <DatePicker
                                selected={minDate}
                                onChange={(date: Date) => setMinDate(date)}
                                className="DSMeta-input-box"
                                dateFormat="dd/MM/yyyy"
                            />
                        </div>
                        <div className="DSMeta-input-box-formatting">
                            <DatePicker
                                selected={maxDate}
                                onChange={(date: Date) => setMaxDate(date)}
                                className="DSMeta-input-box"
                                dateFormat="dd/MM/yyyy"
                            />
                        </div>
                    </div>

                    <div>
                        <div>
                            <table className="DSMeta-sales-table">
                                <thead>
                                    <tr>
                                        <th className="DSMeta-showExtras">ID</th>
                                        <th className="DSMeta-showData">Date</th>
                                        <th className="DSMeta-showExtras">Views</th>
                                        <th className="DSMeta-showExtras">Sales</th>
                                        <th>Employee</th>
                                        <th>Total</th>
                                        <th>Notify</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <td className="DSMeta-showExtras">ID</td>
                                        <td className="DSMeta-showData">08/07/2022</td>
                                        <td className="DSMeta-showExtras">Views</td>
                                        <td className="DSMeta-showExtras">Sales</td>
                                        <td>name1</td>
                                        <td>R$ 52003.00</td>
                                        <td>
                                            <div className="DSMeta-notify-button-container">
                                                <NotificationButton />
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td className="DSMeta-showExtras">ID</td>
                                        <td className="DSMeta-showData">08/07/2022</td>
                                        <td className="DSMeta-showExtras">Views</td>
                                        <td className="DSMeta-showExtras">Sales</td>
                                        <td>name1</td>
                                        <td>R$ 52003.00</td>
                                        <td>
                                            <div className="DSMeta-notify-button-container">
                                                <NotificationButton />
                                            </div>
                                        </td>
                                    </tr>
                                    <tr>
                                        <td className="DSMeta-showExtras">ID</td>
                                        <td className="DSMeta-showData">08/07/2022</td>
                                        <td className="DSMeta-showExtras">Views</td>
                                        <td className="DSMeta-showExtras">Sales</td>
                                        <td>name1</td>
                                        <td>R$ 52003.00</td>
                                        <td>
                                            <div className="DSMeta-notify-button-container">
                                                <NotificationButton />
                                            </div>
                                        </td>
                                    </tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </section>
    )
}
export default SalesCard;