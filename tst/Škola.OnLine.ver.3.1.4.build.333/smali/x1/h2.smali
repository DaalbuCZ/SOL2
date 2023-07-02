.class public final synthetic Lx1/h2;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lx1/t2$a;

.field public final synthetic o:Landroid/util/Pair;


# direct methods
.method public synthetic constructor <init>(Lx1/t2$a;Landroid/util/Pair;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx1/h2;->n:Lx1/t2$a;

    iput-object p2, p0, Lx1/h2;->o:Landroid/util/Pair;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lx1/h2;->n:Lx1/t2$a;

    iget-object v1, p0, Lx1/h2;->o:Landroid/util/Pair;

    invoke-static {v0, v1}, Lx1/t2$a;->h(Lx1/t2$a;Landroid/util/Pair;)V

    return-void
.end method
