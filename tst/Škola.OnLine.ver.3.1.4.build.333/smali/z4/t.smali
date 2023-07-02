.class Lz4/t;
.super La5/m;
.source ""


# instance fields
.field final a:La5/s;

.field final b:Ly4/j;

.field final synthetic c:Lz4/w;


# direct methods
.method constructor <init>(Lz4/w;La5/s;Ly4/j;)V
    .locals 0

    iput-object p1, p0, Lz4/t;->c:Lz4/w;

    invoke-direct {p0}, La5/m;-><init>()V

    iput-object p2, p0, Lz4/t;->a:La5/s;

    iput-object p3, p0, Lz4/t;->b:Ly4/j;

    return-void
.end method


# virtual methods
.method public C(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lz4/t;->c:Lz4/w;

    iget-object p1, p1, Lz4/w;->a:La5/d0;

    iget-object v0, p0, Lz4/t;->b:Ly4/j;

    invoke-virtual {p1, v0}, La5/d0;->r(Ly4/j;)V

    iget-object p1, p0, Lz4/t;->a:La5/s;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onCompleteUpdate"

    invoke-virtual {p1, v1, v0}, La5/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public k(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lz4/t;->c:Lz4/w;

    iget-object p1, p1, Lz4/w;->a:La5/d0;

    iget-object v0, p0, Lz4/t;->b:Ly4/j;

    invoke-virtual {p1, v0}, La5/d0;->r(Ly4/j;)V

    iget-object p1, p0, Lz4/t;->a:La5/s;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onRequestInfo"

    invoke-virtual {p1, v1, v0}, La5/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method
