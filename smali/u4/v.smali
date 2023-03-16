.class final Lu4/v;
.super Lu4/t;
.source ""


# instance fields
.field private final d:Ljava/lang/String;

.field final synthetic e:Lu4/w;


# direct methods
.method constructor <init>(Lu4/w;Lt4/j;Ljava/lang/String;)V
    .locals 2

    iput-object p1, p0, Lu4/v;->e:Lu4/w;

    new-instance v0, Lv4/s;

    const-string v1, "OnRequestInstallCallback"

    invoke-direct {v0, v1}, Lv4/s;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1, v0, p2}, Lu4/t;-><init>(Lu4/w;Lv4/s;Lt4/j;)V

    iput-object p3, p0, Lu4/v;->d:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final k(Landroid/os/Bundle;)V
    .locals 3

    invoke-super {p0, p1}, Lu4/t;->k(Landroid/os/Bundle;)V

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
    iget-object v0, p0, Lu4/t;->b:Lt4/j;

    iget-object v1, p0, Lu4/v;->e:Lu4/w;

    iget-object v2, p0, Lu4/v;->d:Ljava/lang/String;

    invoke-static {v1, p1, v2}, Lu4/w;->f(Lu4/w;Landroid/os/Bundle;Ljava/lang/String;)Lu4/a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lt4/j;->e(Ljava/lang/Object;)Z

    return-void
.end method
