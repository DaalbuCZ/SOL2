.class public final synthetic Lp5/l;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lp5/d0;

.field public final synthetic o:Ln6/b;


# direct methods
.method public synthetic constructor <init>(Lp5/d0;Ln6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp5/l;->n:Lp5/d0;

    iput-object p2, p0, Lp5/l;->o:Ln6/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lp5/l;->n:Lp5/d0;

    iget-object v1, p0, Lp5/l;->o:Ln6/b;

    invoke-static {v0, v1}, Lp5/o;->l(Lp5/d0;Ln6/b;)V

    return-void
.end method
