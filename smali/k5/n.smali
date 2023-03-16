.class public final synthetic Lk5/n;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lk5/d0;

.field public final synthetic o:Li6/b;


# direct methods
.method public synthetic constructor <init>(Lk5/d0;Li6/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk5/n;->n:Lk5/d0;

    iput-object p2, p0, Lk5/n;->o:Li6/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lk5/n;->n:Lk5/d0;

    iget-object v1, p0, Lk5/n;->o:Li6/b;

    invoke-static {v0, v1}, Lk5/o;->l(Lk5/d0;Li6/b;)V

    return-void
.end method
