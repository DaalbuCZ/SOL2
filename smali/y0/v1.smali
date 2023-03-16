.class public abstract Ly0/v1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ly0/e1;


# instance fields
.field private final n:Z

.field private final o:Z

.field private p:Ly0/q1;


# direct methods
.method public constructor <init>(Ly0/q1;ZZ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly0/v1;->p:Ly0/q1;

    iput-boolean p2, p0, Ly0/v1;->n:Z

    iput-boolean p3, p0, Ly0/v1;->o:Z

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const/4 v0, 0x0

    iput-object v0, p0, Ly0/v1;->p:Ly0/q1;

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 2

    invoke-virtual {p0}, Ly0/v1;->e()Z

    move-result v0

    const-string v1, "Interaction"

    if-eqz v0, :cond_0

    invoke-static {v1, p1}, Ly0/i0;->a(Ljava/lang/String;Ljava/lang/String;)V

    :cond_0
    iget-boolean v0, p0, Ly0/v1;->o:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Ly0/v1;->d()Ly0/q1;

    move-result-object v0

    invoke-virtual {v0, v1, p1}, Ly0/q1;->l(Ljava/lang/String;Ljava/lang/String;)V

    :cond_1
    return-void
.end method

.method public d()Ly0/q1;
    .locals 1

    iget-object v0, p0, Ly0/v1;->p:Ly0/q1;

    return-object v0
.end method

.method public e()Z
    .locals 1

    iget-boolean v0, p0, Ly0/v1;->n:Z

    return v0
.end method
