.class final La5/a0;
.super La5/t;
.source ""


# instance fields
.field final synthetic o:La5/c0;


# direct methods
.method constructor <init>(La5/c0;)V
    .locals 0

    iput-object p1, p0, La5/a0;->o:La5/c0;

    invoke-direct {p0}, La5/t;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    iget-object v0, p0, La5/a0;->o:La5/c0;

    iget-object v0, v0, La5/c0;->n:La5/d0;

    invoke-static {v0}, La5/d0;->o(La5/d0;)V

    iget-object v0, p0, La5/a0;->o:La5/c0;

    iget-object v0, v0, La5/c0;->n:La5/d0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La5/d0;->k(La5/d0;Landroid/os/IInterface;)V

    iget-object v0, p0, La5/a0;->o:La5/c0;

    iget-object v0, v0, La5/c0;->n:La5/d0;

    const/4 v1, 0x0

    invoke-static {v0, v1}, La5/d0;->j(La5/d0;Z)V

    return-void
.end method
