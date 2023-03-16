.class Lu4/t;
.super Lv4/m;
.source ""


# instance fields
.field final a:Lv4/s;

.field final b:Lt4/j;

.field final synthetic c:Lu4/w;


# direct methods
.method constructor <init>(Lu4/w;Lv4/s;Lt4/j;)V
    .locals 0

    iput-object p1, p0, Lu4/t;->c:Lu4/w;

    invoke-direct {p0}, Lv4/m;-><init>()V

    iput-object p2, p0, Lu4/t;->a:Lv4/s;

    iput-object p3, p0, Lu4/t;->b:Lt4/j;

    return-void
.end method


# virtual methods
.method public C(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lu4/t;->c:Lu4/w;

    iget-object p1, p1, Lu4/w;->a:Lv4/d0;

    iget-object v0, p0, Lu4/t;->b:Lt4/j;

    invoke-virtual {p1, v0}, Lv4/d0;->r(Lt4/j;)V

    iget-object p1, p0, Lu4/t;->a:Lv4/s;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onCompleteUpdate"

    invoke-virtual {p1, v1, v0}, Lv4/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method

.method public k(Landroid/os/Bundle;)V
    .locals 2

    iget-object p1, p0, Lu4/t;->c:Lu4/w;

    iget-object p1, p1, Lu4/w;->a:Lv4/d0;

    iget-object v0, p0, Lu4/t;->b:Lt4/j;

    invoke-virtual {p1, v0}, Lv4/d0;->r(Lt4/j;)V

    iget-object p1, p0, Lu4/t;->a:Lv4/s;

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "onRequestInfo"

    invoke-virtual {p1, v1, v0}, Lv4/s;->d(Ljava/lang/String;[Ljava/lang/Object;)I

    return-void
.end method
