.class public final enum Lio/flutter/plugins/imagepicker/g$d;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/flutter/plugins/imagepicker/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "d"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/flutter/plugins/imagepicker/g$d;",
        ">;"
    }
.end annotation


# static fields
.field public static final enum o:Lio/flutter/plugins/imagepicker/g$d;

.field public static final enum p:Lio/flutter/plugins/imagepicker/g$d;

.field private static final synthetic q:[Lio/flutter/plugins/imagepicker/g$d;


# instance fields
.field private final n:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lio/flutter/plugins/imagepicker/g$d;

    const-string v1, "IMAGE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2, v2}, Lio/flutter/plugins/imagepicker/g$d;-><init>(Ljava/lang/String;II)V

    sput-object v0, Lio/flutter/plugins/imagepicker/g$d;->o:Lio/flutter/plugins/imagepicker/g$d;

    new-instance v1, Lio/flutter/plugins/imagepicker/g$d;

    const-string v3, "VIDEO"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4, v4}, Lio/flutter/plugins/imagepicker/g$d;-><init>(Ljava/lang/String;II)V

    sput-object v1, Lio/flutter/plugins/imagepicker/g$d;->p:Lio/flutter/plugins/imagepicker/g$d;

    const/4 v3, 0x2

    new-array v3, v3, [Lio/flutter/plugins/imagepicker/g$d;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lio/flutter/plugins/imagepicker/g$d;->q:[Lio/flutter/plugins/imagepicker/g$d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;II)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput p3, p0, Lio/flutter/plugins/imagepicker/g$d;->n:I

    return-void
.end method

.method static synthetic e(Lio/flutter/plugins/imagepicker/g$d;)I
    .locals 0

    iget p0, p0, Lio/flutter/plugins/imagepicker/g$d;->n:I

    return p0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/flutter/plugins/imagepicker/g$d;
    .locals 1

    const-class v0, Lio/flutter/plugins/imagepicker/g$d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/flutter/plugins/imagepicker/g$d;

    return-object p0
.end method

.method public static values()[Lio/flutter/plugins/imagepicker/g$d;
    .locals 1

    sget-object v0, Lio/flutter/plugins/imagepicker/g$d;->q:[Lio/flutter/plugins/imagepicker/g$d;

    invoke-virtual {v0}, [Lio/flutter/plugins/imagepicker/g$d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/flutter/plugins/imagepicker/g$d;

    return-object v0
.end method
