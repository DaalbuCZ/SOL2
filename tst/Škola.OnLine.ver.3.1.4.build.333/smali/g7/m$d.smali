.class final Lg7/m$d;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lg7/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1a
    name = "d"
.end annotation


# static fields
.field static final a:Lcom/google/protobuf/l0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/protobuf/l0<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    sget-object v0, Lcom/google/protobuf/u1$b;->x:Lcom/google/protobuf/u1$b;

    const-string v1, ""

    invoke-static {v0, v1, v0, v1}, Lcom/google/protobuf/l0;->d(Lcom/google/protobuf/u1$b;Ljava/lang/Object;Lcom/google/protobuf/u1$b;Ljava/lang/Object;)Lcom/google/protobuf/l0;

    move-result-object v0

    sput-object v0, Lg7/m$d;->a:Lcom/google/protobuf/l0;

    return-void
.end method
