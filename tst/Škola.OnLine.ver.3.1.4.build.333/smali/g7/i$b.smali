.class public final Lg7/i$b;
.super Lcom/google/protobuf/y$a;
.source ""

# interfaces
.implements Lg7/j;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/i;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "b"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/protobuf/y$a<",
        "Lg7/i;",
        "Lg7/i$b;",
        ">;",
        "Lg7/j;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 1

    invoke-static {}, Lg7/i;->R()Lg7/i;

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/google/protobuf/y$a;-><init>(Lcom/google/protobuf/y;)V

    return-void
.end method

.method synthetic constructor <init>(Lg7/i$a;)V
    .locals 0

    invoke-direct {p0}, Lg7/i$b;-><init>()V

    return-void
.end method


# virtual methods
.method public L(Lg7/c$b;)Lg7/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/i;

    invoke-virtual {p1}, Lcom/google/protobuf/y$a;->C()Lcom/google/protobuf/y;

    move-result-object p1

    check-cast p1, Lg7/c;

    invoke-static {v0, p1}, Lg7/i;->S(Lg7/i;Lg7/c;)V

    return-object p0
.end method

.method public M(Lg7/g;)Lg7/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/i;

    invoke-static {v0, p1}, Lg7/i;->T(Lg7/i;Lg7/g;)V

    return-object p0
.end method

.method public N(Lg7/h;)Lg7/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/i;

    invoke-static {v0, p1}, Lg7/i;->V(Lg7/i;Lg7/h;)V

    return-object p0
.end method

.method public O(Lg7/m;)Lg7/i$b;
    .locals 1

    invoke-virtual {p0}, Lcom/google/protobuf/y$a;->F()V

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/i;

    invoke-static {v0, p1}, Lg7/i;->U(Lg7/i;Lg7/m;)V

    return-object p0
.end method

.method public c()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/i;

    invoke-virtual {v0}, Lg7/i;->c()Z

    move-result v0

    return v0
.end method

.method public h()Lg7/g;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/i;

    invoke-virtual {v0}, Lg7/i;->h()Lg7/g;

    move-result-object v0

    return-object v0
.end method

.method public j()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/i;

    invoke-virtual {v0}, Lg7/i;->j()Z

    move-result v0

    return v0
.end method

.method public m()Lg7/m;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/i;

    invoke-virtual {v0}, Lg7/i;->m()Lg7/m;

    move-result-object v0

    return-object v0
.end method

.method public r()Z
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/i;

    invoke-virtual {v0}, Lg7/i;->r()Z

    move-result v0

    return v0
.end method

.method public s()Lg7/h;
    .locals 1

    iget-object v0, p0, Lcom/google/protobuf/y$a;->o:Lcom/google/protobuf/y;

    check-cast v0, Lg7/i;

    invoke-virtual {v0}, Lg7/i;->s()Lg7/h;

    move-result-object v0

    return-object v0
.end method
