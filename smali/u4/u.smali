.class final Lu4/u;
.super Lu4/t;
.source ""


# direct methods
.method constructor <init>(Lu4/w;Lt4/j;)V
    .locals 2

    new-instance v0, Lv4/s;

    const-string v1, "OnCompleteUpdateCallback"

    invoke-direct {v0, v1}, Lv4/s;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, p2}, Lu4/t;-><init>(Lu4/w;Lv4/s;Lt4/j;)V

    return-void
.end method


# virtual methods
.method public final C(Landroid/os/Bundle;)V
    .locals 2

    invoke-super {p0, p1}, Lu4/t;->C(Landroid/os/Bundle;)V

    invoke-static {p1}, Lu4/w;->a(Landroid/os/Bundle;)I

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lu4/t;->b:Lt4/j;

    new-instance v1, Lx4/a;

    invoke-static {p1}, Lu4/w;->a(Landroid/os/Bundle;)I

    move-result p1

    invoke-direct {v1, p1}, Lx4/a;-><init>(I)V

    invoke-virtual {v0, v1}, Lt4/j;->d(Ljava/lang/Exception;)Z

    return-void

    :cond_0
    iget-object p1, p0, Lu4/t;->b:Lt4/j;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lt4/j;->e(Ljava/lang/Object;)Z

    return-void
.end method
