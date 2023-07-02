.class public final enum Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;
.super Ljava/lang/Enum;
.source ""


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

.field public static final enum DateAndTime:Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

.field public static final enum DayOfMonthAndTime:Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

.field public static final enum DayOfWeekAndTime:Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

.field public static final enum Time:Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    new-instance v0, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    const-string v1, "Time"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;->Time:Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    new-instance v1, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    const-string v3, "DayOfWeekAndTime"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;->DayOfWeekAndTime:Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    new-instance v3, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    const-string v5, "DayOfMonthAndTime"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;->DayOfMonthAndTime:Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    new-instance v5, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    const-string v7, "DateAndTime"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;->DateAndTime:Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    const/4 v7, 0x4

    new-array v7, v7, [Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    aput-object v0, v7, v2

    aput-object v1, v7, v4

    aput-object v3, v7, v6

    aput-object v5, v7, v8

    sput-object v7, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;->$VALUES:[Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

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

.method public static valueOf(Ljava/lang/String;)Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;
    .locals 1

    const-class v0, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    return-object p0
.end method

.method public static values()[Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;
    .locals 1

    sget-object v0, Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;->$VALUES:[Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    invoke-virtual {v0}, [Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/dexterous/flutterlocalnotifications/models/DateTimeComponents;

    return-object v0
.end method
