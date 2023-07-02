.class final Lt3/h0$g;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lt3/h0;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "g"
.end annotation


# instance fields
.field private final n:Lt3/h0$f;


# direct methods
.method public constructor <init>(Lt3/h0$f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt3/h0$g;->n:Lt3/h0$f;

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    iget-object v0, p0, Lt3/h0$g;->n:Lt3/h0$f;

    invoke-interface {v0}, Lt3/h0$f;->k()V

    return-void
.end method
