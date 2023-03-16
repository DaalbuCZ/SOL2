.class public final synthetic Lq3/u;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lq3/x$a;

.field public final synthetic o:Ls1/m1;

.field public final synthetic p:Lv1/i;


# direct methods
.method public synthetic constructor <init>(Lq3/x$a;Ls1/m1;Lv1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lq3/u;->n:Lq3/x$a;

    iput-object p2, p0, Lq3/u;->o:Ls1/m1;

    iput-object p3, p0, Lq3/u;->p:Lv1/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lq3/u;->n:Lq3/x$a;

    iget-object v1, p0, Lq3/u;->o:Ls1/m1;

    iget-object v2, p0, Lq3/u;->p:Lv1/i;

    invoke-static {v0, v1, v2}, Lq3/x$a;->i(Lq3/x$a;Ls1/m1;Lv1/i;)V

    return-void
.end method
