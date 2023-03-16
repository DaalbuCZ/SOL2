.class final Lr9/d;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lr9/c2;


# static fields
.field public static final n:Lr9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lr9/d;

    invoke-direct {v0}, Lr9/d;-><init>()V

    sput-object v0, Lr9/d;->n:Lr9/d;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 1

    const-string v0, "Active"

    return-object v0
.end method
