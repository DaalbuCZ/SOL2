.class Ls8/h$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt8/k$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls8/h;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic n:Ls8/h;


# direct methods
.method constructor <init>(Ls8/h;)V
    .locals 0

    iput-object p1, p0, Ls8/h$a;->n:Ls8/h;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onMethodCall(Lt8/j;Lt8/k$d;)V
    .locals 0

    const/4 p1, 0x0

    invoke-interface {p2, p1}, Lt8/k$d;->a(Ljava/lang/Object;)V

    return-void
.end method
