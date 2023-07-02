.class public final synthetic Lr1/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lr1/c;

.field public final synthetic o:Ll1/p;

.field public final synthetic p:Lj1/h;

.field public final synthetic q:Ll1/i;


# direct methods
.method public synthetic constructor <init>(Lr1/c;Ll1/p;Lj1/h;Ll1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr1/a;->n:Lr1/c;

    iput-object p2, p0, Lr1/a;->o:Ll1/p;

    iput-object p3, p0, Lr1/a;->p:Lj1/h;

    iput-object p4, p0, Lr1/a;->q:Ll1/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lr1/a;->n:Lr1/c;

    iget-object v1, p0, Lr1/a;->o:Ll1/p;

    iget-object v2, p0, Lr1/a;->p:Lj1/h;

    iget-object v3, p0, Lr1/a;->q:Ll1/i;

    invoke-static {v0, v1, v2, v3}, Lr1/c;->b(Lr1/c;Ll1/p;Lj1/h;Ll1/i;)V

    return-void
.end method
