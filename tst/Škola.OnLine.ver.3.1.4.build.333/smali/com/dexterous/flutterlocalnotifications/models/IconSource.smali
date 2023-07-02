.class public final enum Lcom/dexterous/flutterlocalnotifications/models/IconSource;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/dexterous/flutterlocalnotifications/models/IconSource;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/dexterous/flutterlocalnotifications/models/IconSource;

.field public static final enum BitmapFilePath:Lcom/dexterous/flutterlocalnotifications/models/IconSource;

.field public static final enum ByteArray:Lcom/dexterous/flutterlocalnotifications/models/IconSource;

.field public static final enum ContentUri:Lcom/dexterous/flutterlocalnotifications/models/IconSource;

.field public static final enum DrawableResource:Lcom/dexterous/flutterlocalnotifications/models/IconSource;

.field public static final enum FlutterBitmapAsset:Lcom/dexterous/flutterlocalnotifications/models/IconSource;


# direct methods
.method static constructor <clinit>()V
    .locals 11

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    const-string v1, "DrawableResource"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/models/IconSource;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/models/IconSource;->DrawableResource:Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    new-instance v1, Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    const-string v3, "BitmapFilePath"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/dexterous/flutterlocalnotifications/models/IconSource;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/dexterous/flutterlocalnotifications/models/IconSource;->BitmapFilePath:Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    new-instance v3, Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    const-string v5, "ContentUri"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/dexterous/flutterlocalnotifications/models/IconSource;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/dexterous/flutterlocalnotifications/models/IconSource;->ContentUri:Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    new-instance v5, Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    const-string v7, "FlutterBitmapAsset"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/dexterous/flutterlocalnotifications/models/IconSource;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/dexterous/flutterlocalnotifications/models/IconSource;->FlutterBitmapAsset:Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    new-instance v7, Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    const-string v9, "ByteArray"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/dexterous/flutterlocalnotifications/models/IconSource;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/dexterous/flutterlocalnotifications/models/IconSource;->ByteArray:Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    const/4 v9, 0x5

    new-array v9, v9, [Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    aput-object v0, v9, v2

    aput-object v1, v9, v4

    aput-object v3, v9, v6

    aput-object v5, v9, v8

    aput-object v7, v9, v10

    sput-object v9, Lcom/dexterous/flutterlocalnotifications/models/IconSource;->$VALUES:[Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/dexterous/flutterlocalnotifications/models/IconSource;
    .locals 1

    const-class v0, Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    return-object p0
.end method

.method public static values()[Lcom/dexterous/flutterlocalnotifications/models/IconSource;
    .locals 1

    sget-object v0, Lcom/dexterous/flutterlocalnotifications/models/IconSource;->$VALUES:[Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    invoke-virtual {v0}, [Lcom/dexterous/flutterlocalnotifications/models/IconSource;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/dexterous/flutterlocalnotifications/models/IconSource;

    return-object v0
.end method
