.class public final synthetic Lm1/a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lm1/c;

.field public final synthetic o:Lg1/p;

.field public final synthetic p:Le1/h;

.field public final synthetic q:Lg1/i;


# direct methods
.method public synthetic constructor <init>(Lm1/c;Lg1/p;Le1/h;Lg1/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lm1/a;->n:Lm1/c;

    iput-object p2, p0, Lm1/a;->o:Lg1/p;

    iput-object p3, p0, Lm1/a;->p:Le1/h;

    iput-object p4, p0, Lm1/a;->q:Lg1/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    iget-object v0, p0, Lm1/a;->n:Lm1/c;

    iget-object v1, p0, Lm1/a;->o:Lg1/p;

    iget-object v2, p0, Lm1/a;->p:Le1/h;

    iget-object v3, p0, Lm1/a;->q:Lg1/i;

    invoke-static {v0, v1, v2, v3}, Lm1/c;->b(Lm1/c;Lg1/p;Le1/h;Lg1/i;)V

    return-void
.end method
