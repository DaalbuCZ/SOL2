.class public final synthetic Lp3/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Ljava/util/concurrent/CopyOnWriteArraySet;

.field public final synthetic o:I

.field public final synthetic p:Lp3/q$a;


# direct methods
.method public synthetic constructor <init>(Ljava/util/concurrent/CopyOnWriteArraySet;ILp3/q$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lp3/p;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    iput p2, p0, Lp3/p;->o:I

    iput-object p3, p0, Lp3/p;->p:Lp3/q$a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lp3/p;->n:Ljava/util/concurrent/CopyOnWriteArraySet;

    iget v1, p0, Lp3/p;->o:I

    iget-object v2, p0, Lp3/p;->p:Lp3/q$a;

    invoke-static {v0, v1, v2}, Lp3/q;->a(Ljava/util/concurrent/CopyOnWriteArraySet;ILp3/q$a;)V

    return-void
.end method
