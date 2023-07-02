.class public final synthetic Lb2/q;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lb2/w$a;

.field public final synthetic o:Lb2/w;


# direct methods
.method public synthetic constructor <init>(Lb2/w$a;Lb2/w;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/q;->n:Lb2/w$a;

    iput-object p2, p0, Lb2/q;->o:Lb2/w;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lb2/q;->n:Lb2/w$a;

    iget-object v1, p0, Lb2/q;->o:Lb2/w;

    invoke-static {v0, v1}, Lb2/w$a;->a(Lb2/w$a;Lb2/w;)V

    return-void
.end method
