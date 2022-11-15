import logo from '../../assets/img/logo.svg'
import './styles.css'

function Header() {
    return (
        <header>
            <div className="DSMeta-logo-container">
                <img src={logo} alt="DSMeta" />
                <h1>DSMeta</h1>
                <p>
                    Developed by
                    <a href="https://www.linkedin.com/in/nickolas-alves/"
                    >Nickolas Alves</a
                    >
                </p>
            </div>
        </header>
    )
}
export default Header