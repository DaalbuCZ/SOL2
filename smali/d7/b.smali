.class public final synthetic Ld7/b;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lt4/a;


# instance fields
.field public final synthetic a:Lcom/google/firebase/remoteconfig/a;

.field public final synthetic b:Lt4/i;

.field public final synthetic c:Lt4/i;


# direct methods
.method public synthetic constructor <init>(Lcom/google/firebase/remoteconfig/a;Lt4/i;Lt4/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld7/b;->a:Lcom/google/firebase/remoteconfig/a;

    iput-object p2, p0, Ld7/b;->b:Lt4/i;

    iput-object p3, p0, Ld7/b;->c:Lt4/i;

    return-void
.end method


# virtual methods
.method public final a(Lt4/i;)Ljava/lang/Object;
    .locals 3

    iget-object v0, p0, Ld7/b;->a:Lcom/google/firebase/remoteconfig/a;

    iget-object v1, p0, Ld7/b;->b:Lt4/i;

    iget-object v2, p0, Ld7/b;->c:Lt4/i;

    invoke-static {v0, v1, v2, p1}, Lcom/google/firebase/remoteconfig/a;->c(Lcom/google/firebase/remoteconfig/a;Lt4/i;Lt4/i;Lt4/i;)Lt4/i;

    move-result-object p1

    return-object p1
.end method
