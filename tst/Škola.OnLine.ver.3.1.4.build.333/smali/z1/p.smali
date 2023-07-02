.class public final synthetic Lz1/p;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic n:Lz1/t$a;

.field public final synthetic o:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lz1/t$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz1/p;->n:Lz1/t$a;

    iput-object p2, p0, Lz1/p;->o:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lz1/p;->n:Lz1/t$a;

    iget-object v1, p0, Lz1/p;->o:Ljava/lang/String;

    invoke-static {v0, v1}, Lz1/t$a;->g(Lz1/t$a;Ljava/lang/String;)V

    return-void
.end method
