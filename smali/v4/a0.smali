.class final Lv4/a0;
.super Lv4/t;
.source ""


# instance fields
.field final synthetic o:Lv4/c0;


# direct methods
.method constructor <init>(Lv4/c0;)V
    .locals 0

    iput-object p1, p0, Lv4/a0;->o:Lv4/c0;

    invoke-direct {p0}, Lv4/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, Lv4/a0;->o:Lv4/c0;

    iget-object v0, v0, Lv4/c0;->n:Lv4/d0;

    invoke-static {v0}, Lv4/d0;->o(Lv4/d0;)V

    iget-object v0, p0, Lv4/a0;->o:Lv4/c0;

    iget-object v0, v0, Lv4/c0;->n:Lv4/d0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lv4/d0;->k(Lv4/d0;Landroid/os/IInterface;)V

    iget-object v0, p0, Lv4/a0;->o:Lv4/c0;

    iget-object v0, v0, Lv4/c0;->n:Lv4/d0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lv4/d0;->j(Lv4/d0;Z)V

    return-void
.end method
